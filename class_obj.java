class appl_form{
    String Name;
    int nbr;

    void display(){
        System.out.println("Name of the Applicant : "+Name);
        System.out.println("Number of the Applicant : "+nbr);
    }

    void SetValue(String nm,int r){
        Name=nm;
        nbr=r;
    }

    appl_form(){
        System.out.println("Dfault");
    }
}
 class class2 {
    public static void main(String[] args) {
        appl_form a1 = new appl_form();
        appl_form a2 = new appl_form();

        a1.Name="SANTHOSHKUMAR";
        a1.nbr=123;
        a1.display();
        a2.display(); //while calling this method,value of name nd nbr will be null bcz it initially assign value as null

        a2.SetValue("SANTHO",1234);
        a2.display();
    }
}


