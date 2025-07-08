#include<iostream>
#include<string>
using namespace std;
class Teacher{
    private:
        double salary;
    public:
        //Non-Parameterized
        Teacher(){
            cout<<"I am constructor."<<endl;
        }
        //Parameterized
        Teacher(string n,string d, string s, double sal){
            name = n;
            dept = d;
            subject = s;
            salary = sal;
        }
        string name;
        string dept;
        string subject;
        
       void getInfo(){
        cout<<"Name:"<<name<<endl;
        cout<<"Subject:"<<subject<<endl;
       }
};
int main()
{
    Teacher t1("Shardha","CSE","C++",25000);
    t1.getInfo();
    return 0;
}