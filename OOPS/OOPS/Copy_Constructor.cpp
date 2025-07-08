#include<iostream>
#include<string>
using namespace std;
class Teacher{
    private:
        double salary;
    public:
        string name;
        string dept;
        string subject;
        //Parameterized
        Teacher(string name,string dept, string subject, double salary){
            this->name = name;
            this->dept = dept;
            this->subject = subject; 
            this->salary = salary;
        }

       //copyconstructor
        Teacher(Teacher &orgObj){
            cout<<"I am custom copy constructor."<<endl;
            this->name = orgObj.name;
            this->dept = orgObj.dept;
            this->subject = orgObj.subject;
            this->salary = orgObj.salary;
        }
        
        void changeDept(string newDept){
            dept = newDept;
        }
       void getInfo(){
        cout<<"Name:"<<name<<endl;
        cout<<"Subject:"<<subject<<endl;
       }
};
int main()
{
    Teacher t1("Shardha","CSE","C++",25000);
    t1.getInfo();
    Teacher t2(t1);//custom copy constructor invoke.
    t2.getInfo();
    return 0;
}