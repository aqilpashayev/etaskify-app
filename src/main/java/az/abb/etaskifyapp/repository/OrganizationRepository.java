package az.abb.etaskifyapp.repository;

import az.abb.etaskifyapp.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    boolean existsByOrgName(String orgName);
}
