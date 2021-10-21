/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Oct 21, 2021
 */
package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Halloween;

/**
 * @author delan
 *
 */
@Repository
public interface HolidaysRepository extends JpaRepository <Halloween, Long> {}
