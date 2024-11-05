package bo.custom.impl;


import bo.custom.StudentBO;
import dao.DAOFactory;
import dao.custom.CulinaryProgramDAO;
import dao.custom.StudentDAO;
import dto.CulinaryProgramDTO;
import dto.StudentDTO;
import entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentBOImpl  implements StudentBO {

    StudentDAO studentDAO = (StudentDAO) DAOFactory.getDAO(DAOFactory.DAOType.STUDENT);

    CulinaryProgramDAO culinaryProgramDAO = (CulinaryProgramDAO) DAOFactory.getDAO(DAOFactory.DAOType.PROGRAM);
    @Override
    public void deleteStudent(StudentDTO studentDTO) {
        Student student = new Student(studentDTO.getStudentId(),studentDTO.getName(),studentDTO.getAddress(),studentDTO.getTel(),studentDTO.getRegistrationDate(),studentDTO.getEnrollments());
        studentDAO.deleteStudent(student);
    }

    @Override
    public void updateStudent(StudentDTO studentDTO) {
        Student student = new Student(studentDTO.getStudentId(),studentDTO.getName(),studentDTO.getAddress(),studentDTO.getTel(),studentDTO.getRegistrationDate(),studentDTO.getEnrollments());
        studentDAO.updateStudent(student);
    }

    @Override
    public List<StudentDTO> getAllStudent() {
        List<Student> allStudent = studentDAO.getAllStudent();
        List<StudentDTO> studentDTOS = new ArrayList<>();

        for (Student student : allStudent) {
            studentDTOS.add(new StudentDTO(student.getStudentId(),student.getName(),student.getAddress(),student.getTel(),student.getRegistrationDate(),student.getEnrollments()));
        }
        return studentDTOS;
    }

    @Override
    public List<CulinaryProgramDTO> getAllCulinaryProgram() {
        return null;
    }

    @Override
    public void saveStudentWithProgram(StudentDTO object, String value, double v) {

    }

    @Override
    public StudentDTO getStudent(String studentId) {
        return null;
    }
}
