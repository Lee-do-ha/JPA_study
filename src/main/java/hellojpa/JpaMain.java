package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {

//            멤버 조회
//            Member findMember = em.find(Member.class, (long)11);

//            멤버 등록
//            비영속 상태 = JPA에 저장하지 않은 상태
//            Member member = new Member();
//            member.setId(1);
//            member.setName("doha");

//            영속 상태 = JPA에 저장한 상태
//            em.persist(member);

//            Member findMember = em.find(Member.class, (long)11);

//            멤버 조회 후 수정하면 자동으로 update Query문이 실행
//            findMember.setName("HelloJPA");

//            쿼리문 작성
//            List<Member> result = em.createQuery("select m from Member as m", Member.class)
//                            .getResultList();
//            for (Member member : result) {
//                System.out.println(member.getName());
//            }

            tx.commit();
        } catch (Exception e){
            tx.rollback();
        } finally {
            em.close();
        }

        emf.close();
    }
}
