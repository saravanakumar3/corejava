package com.chainsys.miniproject.test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctorDao {        

    public static void testInsertDoctor() {
        
        Doctor newdoc=new Doctor();
        newdoc.setDoct_ID(101);
        newdoc.setDoct_Name("John");
        Calendar c1= Calendar.getInstance();
        java.util.Date newtime= c1.getTime();
        newdoc.setDOB(newtime);
        newdoc.setSpeciality("ENT doctor");
        newdoc.setCity("CHENNAI");
        newdoc.setPhone_No(97877896);
        newdoc.setStandard_Fees((float) 100);
        int result =DoctorDao.insertDoctor(newdoc);
        System.out.println(result);      
  }    
    public static void testUpdateDocotor() {
        
         {
                Doctor oldDoctor = DoctorDao.getDoctorById(105);
                oldDoctor.setDoct_Name("Nishanth");
                String s1="23/04/1986";
                java.util.Date dob;
                try {
                    dob = new SimpleDateFormat("dd/MM/yyyy").parse(s1);
                      oldDoctor.setDOB(dob);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                oldDoctor.setCity("Chennai");
                oldDoctor.setSpeciality("Neurologist");
                oldDoctor.setPhone_No(987545674);
                oldDoctor.setStandard_Fees((float) 4000);
                int result = DoctorDao.updateDoctor(oldDoctor);
                System.out.println(oldDoctor.getDoct_ID()+" "+oldDoctor.getDoct_Name()+" "+
                oldDoctor.getStandard_Fees()+" "+oldDoctor.getPhone_No()+" "+oldDoctor.getSpeciality());
                System.out.println(result);
         }
        }
      public static void testDeleteDoctor() {
        int result =DoctorDao.deleteDoctor(101);
        System.out.println(result);
    }   
      public static void testGetAllDoctors() {
          List<Doctor> allDoctors=DoctorDao.getAllDoctors();
          Iterator<Doctor> dociterator=allDoctors.iterator();
          while (dociterator.hasNext()) {
              Doctor doc=dociterator.next();
              System.out.println(doc.getDoct_ID()+" "+doc.getDoct_Name()+" "+doc.getPhone_No()+" "
              +doc.getSpeciality()+" "+doc.getStandard_Fees()+" "+doc.getCity());
          }
         
      }
     public static void testGetDoctorById() {
        Doctor doc =DoctorDao.getDoctorById(105);
        System.out.println(doc.getDoct_ID()+" " +doc.getDoct_Name()+" "+doc.getStandard_Fees());
    }
    }