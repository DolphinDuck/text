/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerexample;

import java.util.ArrayList;
import java.util.List;

class Subject {
 
 public void registerObserver(Observer observer) {
    observers.add(observer);
  }
 public void unregisterObserver(Observer observer) 
 {
    observers.remove(observer);
  }
public  void notifyObservers()  
{ 
    for (Observer observer: observers) 
        observer.update();
  }

 private  List<Observer> observers = new ArrayList<Observer> ();
};