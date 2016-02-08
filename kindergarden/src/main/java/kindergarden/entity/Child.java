package kindergarden.entity;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Child {
    private int id;
    private String name;
    private String surname;
    private Date dateOfBurth;
    private int groupId;

    public Child() {

    }

    public Child(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Child(String name, String surname, Date dateOfBurth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBurth = dateOfBurth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBurth() {
        return dateOfBurth;
    }

    public void setDateOfBurth(Date dateOfBurth) {
        this.dateOfBurth = dateOfBurth;
    }
    
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getAge() {
        Calendar burthCal = GregorianCalendar.getInstance();
        burthCal.setTime(dateOfBurth);
        return Math.max(GregorianCalendar.getInstance().get(Calendar.YEAR) - burthCal.get(Calendar.YEAR), 0);
    }
}
