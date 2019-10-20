##ビジネス上の機能説明
Feature: Reset functionality on login page of Application 

##テストシナリオの内容
Scenario Outline: Verification of Reset button 

##前提条件
Given Open the Chrome and launch the application			

##アクション
When Enter the Username <username>and Password <password>

##予測される結果を記入
Then Reset the credential

Examples:                      		
|username  |password         |
|User01    |password01       |