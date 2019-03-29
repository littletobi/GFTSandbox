package com.gft.spingboot.dao;

        import com.gft.spingboot.entity.ContactData;
        import com.gft.spingboot.entity.Tester;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;

        import java.util.List;


public interface TesterDao extends JpaRepository<Tester, Integer> {

//        @Query("SELECT t FROM TESTERS_TABLE t WHERE t.ID=:id") //ID=?1
        Tester findUserById(int id);



//        @Query("SELECT t FROM Tester t WHERE t.id=?1") //ID=?1
//Tester findTesterById(int id);

//        @Query("SELECT t.contactData FROM CONTACT_TABLE t WHERE t.ID=:id")//ID=?1
//        List<ContactData> getAllContactData(@Param("id") int id);

//                @Query("SELECT t.contactData FROM CONTACT_TABLE t WHERE t.ID=?1")
//        List<ContactData> getAllContactData(int id);
}