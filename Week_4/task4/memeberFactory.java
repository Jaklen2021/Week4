/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;


public class memeberFactory {
    public Staff getStaff (String StaffName) {
    String S =StaffName.toLowerCase();
    switch (S){
        case "Doctor":
            return  Doctor;
        case "TeachingAssistant" :
            return  TeachingAssistant ;
        default:
            return null;
    }
}
    }
