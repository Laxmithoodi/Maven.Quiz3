package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private String labName;

    private LabStatus labStatus;
    private Map<Lab, LabStatus> student;

    Lab lab = new Lab();


    public Student() {

       this.student = new HashMap<>();
    }

    public Student(Map<Lab, LabStatus> map) {
        this.student = map;



    }

    public Lab getLab(String labName) {

        lab.getName();

        this.labName = labName;

        return lab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        this.labName = labName;


        this.labStatus = LabStatus.INCOMPLETE;
        this.labStatus=  LabStatus.PENDING;

    }


    public void forkLab(Lab lab) {
        this.labStatus= LabStatus.COMPLETED;
        this.labStatus = LabStatus.INCOMPLETE;
        this.labStatus=  LabStatus.PENDING;

    }



    public LabStatus getLabStatus(String labName) {

        this.labStatus= LabStatus.COMPLETED;
        this.labStatus = LabStatus.INCOMPLETE;
        this.labStatus=  LabStatus.PENDING;
       return labStatus;


      //  throw new UnsupportedOperationException("Method not yet implemented");
    }

    @Override
    public String toString() {
        return "Student{" +
                "labName='" + labName + '\'' +
                ", labStatus=" + labStatus +
                '}';
    }
}
