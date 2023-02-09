/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ic2_startercode;

/**enum -loose coupling
 *enum - value and type safety 
 *enum - predefined constants
 * enum is a special class, is an user defined 
 * @author Ahmed
 */
public class Card
{
    public enum Suit {HEARTS, DIAMOND, SPADES, CLUBS};
     public enum Value {ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};
     private Suit  s; // enum user defind detatype
     private Value v;
}
