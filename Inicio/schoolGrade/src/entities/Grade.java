package entities;

public class Grade {

    public String name;
    public Double a,b,c;

    public double finalGrade(){
        return a +b + c;
    }

    public double missingPoints(){

        if (finalGrade() < 60){
            return   60 - finalGrade();
        }else{
            return 0.0;
        }
    }




}
