package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.builder.UniversityBuilder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //재너릭을 사용해 학생 타입 ArrayList 생성
        final ArrayList<Student> studentList = new ArrayList<Student>();
        final ArrayList<Professor> professorList = new ArrayList<Professor>();
        final ArrayList<University> univList = new ArrayList<University>();
        final ArrayList<Department> departList = new ArrayList<Department>();

        //3개의 학생 객체 생성
        final Student student1 = new Student();
        final StudentBuilder studentBuilder = new StudentBuilder();
        final Student student2 = studentBuilder
                .setStudentNum(12345)
                .setStudentName("쿠기")
                .setGrade(2)
                .setDepartment("래퍼학과")
                .setStudentEmail("coogie@a.com")
                .setStudentAddress("서울시 강남구")
                .setStudentAge(26)
                .setState("휴학").build();
        final Student student3 = studentBuilder
                .setStudentNum(67892)
                .setStudentName("김우빈")
                .setGrade(3)
                .setDepartment("배우")
                .setStudentEmail("bin@a.com")
                .setStudentAddress("서울시 강남구")
                .setStudentAge(29)
                .setState("취업계").build();

        //ArrayList에 객체 생성
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        final Professor professor1 = new Professor();
        final ProfessorBuilder professorBuilder = new ProfessorBuilder();
        final Professor professor2 = professorBuilder
                .setProfessorIdx(333)
                .setProfessorName("나웅수")
                .setProfessorPhone(12340987)
                .setDepartment("컴퓨터공학")
                .setSubject("데이터베이스").build();
        final Professor professor3 = professorBuilder
                .setProfessorIdx(555)
                .setProfessorName("이재원")
                .setProfessorPhone(88887777)
                .setDepartment("컴퓨터시스템")
                .setSubject("프로젝트설계").build();

        professorList.add(professor1);
        professorList.add(professor2);
        professorList.add(professor3);

        final University university1 = new University();
        final UniversityBuilder univBuilder = new UniversityBuilder();
        final University university2 = univBuilder
                .setUnivName("고려대학교")
                .setUnivNum(5)
                .setUnivAddress("서울시 성북구")
                .setUnivPhone(34567543).build();
        final University university3 = univBuilder
                .setUnivName("성균관대학교")
                .setUnivNum(6)
                .setUnivAddress("서울시 성북구")
                .setUnivPhone(74567543).build();

        univList.add(university1);
        univList.add(university2);
        univList.add(university3);

        final Department department1 = new Department();
        final DepartmentBuilder departBuilder = new DepartmentBuilder();
        final Department department2 = departBuilder
                .setDepartIdx(77)
                .setDepartName("정보시스템")
                .setDepartType("공대")
                .setCallNum(23456788L).build();
        final Department department3 = departBuilder
                .setDepartIdx(99)
                .setDepartName("수학")
                .setDepartType("자연대")
                .setCallNum(77756788L).build();

        departList.add(department1);
        departList.add(department2);
        departList.add(department3);

        //ArrayList를 돌면서 각 객체의 toString 메소드 실행
        for(final Student s: studentList){
            System.out.println(s.toString());
        }
        System.out.println();
        for(final Professor p: professorList){
            System.out.println(p.toString());
        }
        System.out.println();
        for(final University u: univList){
            System.out.println(u.toString());
        }
        System.out.println();
        for(final Department d: departList){
            System.out.println(d.toString());
        }
    }
}
