package com.example.cellphones.repository;

import com.example.cellphones.dto.CategoryDashboardDto;
import com.example.cellphones.model.parking.VehicleCategory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleCategoryRepository extends JpaRepository<VehicleCategory, Long> {
    @Query("select v from VehicleCategory v where (:searchText is null or (v.name like %:searchText% or v.description like %:searchText%))")
    Page<VehicleCategory> getPaginate(String searchText, Pageable pageable);

    @Query("select new com.example.cellphones.dto.CategoryDashboardDto(vc.name, COUNT(v.id)) " +
            "from VehicleCategory vc " +
            "join Vehicle v " +
            "on v.vehicleCategory.id = vc.id " +
            "group by vc.name " +
            "order by vc.name")
    List<CategoryDashboardDto> category();
}
