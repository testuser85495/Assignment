//Write a program to demonstrate a Rock Paper Scissor Game.
#include<iostream>
#include<string>
#include<stdlib.h>
#include<ctime>

using namespace std;

//function create to give random number form computer
int ComputerChoice()
{
	int move;
	
//	random number logic
	srand(time(0));
	move = (rand()%3)+1;
	
	return move;
}
//class create
class Game
{
//	Accress Specifier
	private:
		string name;
		int round;
		int userchoice;
		int usercount;
		int copmutercount;
		
//	Accress Specifier	
	public:
//		function cretae for user input
		void UserIpnut()
		{
			cout<<"====================NAME====================="<<endl;
			cout<<endl;
			cout<<"Enter Your Name:";
//			getline use for more than one word to read
			getline(cin , name);
			cout<<endl;
			cout<<"====================ROUNDS==================="<<endl;
			cout<<endl;
			cout<<name<<" How Many Rounds You Wnat To Play? : ";
			cin>>round;
			cout<<endl;
			cout<<"====================GAME====================="<<endl;
			cout<<endl;
		}
//		function create for user choice & Score & winner per round 
		void play()
		{
//			loop for how many round user say
			for(int i=1;i<=round;i++)
			{
				cout<<endl;
				cout<<"Round No :- "<<i<<"/"<<round<<endl;
				cout<<endl;
				cout<<name<<" Score = "<<usercount<<endl;
				cout<<"Computer Score = "<<copmutercount<<endl;
				cout<<endl;
				
				cout<<"1) ROCK"<<endl;
				cout<<"2) PAPER"<<endl;
				cout<<"3) SCISSOR"<<endl;
				cout<<endl;
				
				cout<<"Select Your Choice: ";
				cin>>userchoice;
				
//				function call ComputerChoice
				int computerchoice = ComputerChoice();
				cout<<"Computer Choice: "<<computerchoice<<endl;
				
//				condition of winner
				if(userchoice == 1 && computerchoice == 3 || userchoice == 2 && computerchoice == 1 || userchoice == 3 && computerchoice == 2)
				{
					cout<<endl;
					cout<<"You Win"<<endl;
					usercount++;
				}
				else if(userchoice == 1 && computerchoice == 2 || userchoice == 2 && computerchoice == 3 || userchoice == 3 && computerchoice == 1)
				{
					cout<<endl;
					cout<<"Computer Win"<<endl;
					copmutercount++;
				}
				else 
				{
					cout<<endl;
					cout<<"Draw"<<endl;
				}
				cout<<endl;
//				use to pause system (Press any key to continue)
				system("pause");
			}
		}
//		function create for final winner
		void winner()
		{
//			condition on usercount & copmutercount to decide winner
			if(usercount < copmutercount)
			{
				cout<<endl;
				cout<<"Computer Win The Game"<<endl;
			}
			else if(usercount > copmutercount)
			{
				cout<<endl;
				cout<<"You Win The Game"<<endl;
			}
			else
			{
				cout<<endl;
				cout<<"The Game is Draw"<<endl;
			}
		}	
};

int main()
{
//	object create for game class
	Game obj;
	
//	function call UserIpnut
	obj.UserIpnut();
//	function call play
	obj.play();
//	function call winner
	obj.winner();
	
	return 0;
}











