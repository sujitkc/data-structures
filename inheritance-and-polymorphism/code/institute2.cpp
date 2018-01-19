#include <iostream>
#include <string>

using namespace std;
class Person {
protected:
  const string name;
public:
  Person(string n) : name(n) {}
};

class Professor : public Person {
public:
  Professor(string n) : Person(n) {}
  
  void teach(string course, string cl) {
    cout << "Prof. " << Person::name << " teaches course " << course
      << " to class " << cl << "." << endl;
  }
};

class Warden : public Person {
public:
  Warden(string n) : Person(n) {}
  void approve(string request) {
    cout << "Warden " << Person::name << " approves request " << request << "." << endl;
  }
};

class ProfessorWarden : public Professor, public Warden {
public:
  ProfessorWarden(string n) : Professor(n), Warden("ditto") {}
  void doWork() {
    cout << "Prof. " << Person::name << " teaches and approves requests." << endl;
  }
};

int main() {
  Professor prof("Sujit");
  prof.teach("Java", "MT2017");

  Warden warden("Sujit");
  warden.approve("Dinner out");

  ProfessorWarden profwarden("SKC");
  
  Professor *profptr = &profwarden;
  Warden * wardenptr = &profwarden;

  profptr->teach("Python", "IMT2017");
  wardenptr->approve("party request");

  ProfessorWarden * profwardenptr = &profwarden;
  profwardenptr->teach("Programming Languages", "IMT2013");
  profwardenptr->approve("Cultural festival request");
  profwardenptr->doWork();

  return 0;
}
