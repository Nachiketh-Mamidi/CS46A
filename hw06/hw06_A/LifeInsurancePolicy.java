/**
* Write a description of class LifeInsurancePolicy here.
* This class calculates the premium based on age,
* gender, and crime rate of place.
*
* @author Nachiketh Mamidi
* @version March 23, 2021
*/
public class LifeInsurancePolicy
{
    private boolean crimeRate ;
    Person person ;
    /**
     * Consructs a Person object with the crime rate in person area.
     *
     * @param personParam the object of class Person
     * @param value is the crime rate in person area
     *      
     */
    public LifeInsurancePolicy(Person personParam, boolean value)
    {
        person = personParam;
        crimeRate = value;
    }
 
    /**
     * Gets the age of the person object.
     *
     * @return the age of the person object
     */
    public int policyHolderAge()
    {
        return person.getAge();
    }
 
    /**
     * Gets the gender of the person object.
     *
     * @return the gender of the person object
     */
    public char policyHolderGender()
    {
        return person.getGender();
    }
 
    /**
     * Increases the age of this person object by 1 year.
     */
    public void incrementAge()
    {
        person.birthday();
    }
 
    /**
     * Finds the premium of person object based on age, gender and crimeRate is persons area.
     *
     * @return premium return the final premium of person object
     */
     
    public double premium()
    {
        double premium  ;
        double premiumRate = -1;
        char gender = person.getGender();
        int age = person.getAge();
        if(age < 21)
        {
            if(gender == 'm')
 
                premiumRate = 20;
 
            else
                premiumRate = 18.50;
        }
        else if(age >= 21 && age < 60)
        {
            if(gender == 'm')
 
                premiumRate = 50;
 
            else
                premiumRate = 45;
        }
        else if(age >= 60 && age < 80)
        {
            if(gender == 'm')
 
                premiumRate = 110;
 
            else
                premiumRate = 100;
        }
        else if(age >= 80)
        {
          age = 1;
        }
        if((crimeRate == true) && (age != 1))
        {
        
            premium = age * premiumRate + 0.1 * (age * premiumRate);
        }
        else
        {
          premium = age * premiumRate;
        }
  
        return premium;
    }
}