package oops_07th_Jan_2024.inheritance;

public class Programming {

    int version;
    String author;
    Programming()
    {
        System.out.println("DC");

    }

    Programming(String author,int version){
        this.author=author;
        this.version=version;
    }
void printInfo()
{
    System.out.println("Programming Details --->"  +this.author + this.version);
}

    void car(){
        System.out.println("Lambo");
    }
    void bhk3(){
        System.out.println("3BHK");
    }
}
