package rocks.zipcode.io.quiz3.collections;

import rocks.zipcode.io.quiz3.objectorientation.enums.LabStatus;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {


    private String labName;

    public Lab() {

        this("");

    }

    public Lab(String labName) {
        this.labName = labName;
    }

    public String getName() {

        return labName;
    }



}
