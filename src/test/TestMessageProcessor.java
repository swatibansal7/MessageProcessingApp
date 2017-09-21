package test;

import   org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import main.Adjustment;
import main.Message;
import main.MessageProcessor;
import main.Operation;
import main.Products;
import main.Sale;

import java.util.*;

public class TestMessageProcessor {

	@SuppressWarnings("deprecation")
	@Test
	public void testMessageProcessorForMoreThan50Messages() {
		List<Message> messages = createMessageList();
		MessageProcessor mp = new MessageProcessor();
		
		for(Message message : messages) {
			mp.processor(message);
		}
		Assert.assertEquals(mp.messageSize, 51);
		
	}
		
	List<Message> createMessageList(){
		
		List<Message>  messages = new ArrayList<>();
		
		  Message message1 = new Message(new Sale(Products.APPLE, 10), 1);
		  Message message2 = new Message(new Sale(Products.APPLE, 10), 20);
		  Message message3 = new Message(new Sale(Products.CHERRY, 20), 5);
		  Message message4 = new Message(new Sale(Products.CHERRY, 20), 10);
		  Message message5 = new Message(new Sale(Products.PEAR, 15), 3);
		  Message message6 = new Message(new Sale(Products.PEAR, 15), 25);
		  Message message7 = new Message(new Sale(Products.PEAR, 20), 25 , new Adjustment(Operation.ADD , 5));
		  Message message8 = new Message(new Sale(Products.CHERRY, 10), 10 , new Adjustment(Operation.SUBSTRACT , 10));
		  Message message9 = new Message(new Sale(Products.GRAPES, 2), 1);
		  Message message10 = new Message(new Sale(Products.GRAPES, 2), 20);		 
		  Message message11 = new Message(new Sale(Products.CHERRY, 10), 1);
		  Message message12 = new Message(new Sale(Products.APPLE, 10), 2);
		  Message message13 = new Message(new Sale(Products.PEAR, 20), 5);
		  Message message14 = new Message(new Sale(Products.CHERRY, 10), 8);
		  Message message15 = new Message(new Sale(Products.GRAPES, 2), 3);
		  Message message16 = new Message(new Sale(Products.PEAR, 15), 25);
		  Message message17 = new Message(new Sale(Products.PEAR, 25), 10 , new Adjustment(Operation.ADD , 5));
		  Message message18 = new Message(new Sale(Products.CHERRY, 20), 10 , new Adjustment(Operation.MULTIPLY , 2));
		  Message message19 = new Message(new Sale(Products.APPLE, 15), 25 , new Adjustment(Operation.ADD , 5));
		  Message message20 = new Message(new Sale(Products.GRAPES, 10), 10 , new Adjustment(Operation.MULTIPLY , 5));
		  
		  Message message21 = new Message(new Sale(Products.ORANGE, 5), 1);
		  Message message22 = new Message(new Sale(Products.PLUM, 4), 2);
		  Message message23 = new Message(new Sale(Products.MANGO, 12), 5);
		  Message message24 = new Message(new Sale(Products.ORANGE, 5), 8);
		  Message message25 = new Message(new Sale(Products.MANGO, 12), 15);
		  Message message26 = new Message(new Sale(Products.PLUM, 4), 25);
		  Message message27 = new Message(new Sale(Products.ORANGE, 8), 10 , new Adjustment(Operation.ADD , 3));
		  Message message28 = new Message(new Sale(Products.PLUM, 3), 20 , new Adjustment(Operation.SUBSTRACT , 1));
		  Message message29 = new Message(new Sale(Products.MANGO, 10), 30 , new Adjustment(Operation.SUBSTRACT , 2));
		  Message message30 = new Message(new Sale(Products.PEAR, 25), 10 );
		  Message message31 = new Message(new Sale(Products.CHERRY, 20), 10 );
		  Message message32 = new Message(new Sale(Products.APPLE, 15), 5 );
		  Message message33 = new Message(new Sale(Products.GRAPES, 10), 10 );
		  Message message34 = new Message(new Sale(Products.ORANGE, 8), 10);
		  Message message35 = new Message(new Sale(Products.PLUM, 3), 20 );
		  Message message36 = new Message(new Sale(Products.MANGO, 10), 4);		  
		  Message message37 = new Message(new Sale(Products.ORANGE, 8), 5);
		  Message message38 = new Message(new Sale(Products.PLUM, 3), 30 );
		  Message message39 = new Message(new Sale(Products.MANGO, 10), 10 );
		  Message message40 = new Message(new Sale(Products.GRAPES, 10), 20 );			 
		  Message message41 = new Message(new Sale(Products.PINEAPPLE, 30), 1);
		  Message message42 = new Message(new Sale(Products.PLUM, 3), 6);
		  Message message43 = new Message(new Sale(Products.MANGO, 10), 5);
		  Message message44 = new Message(new Sale(Products.PINEAPPLE, 30), 8);
		  Message message45 = new Message(new Sale(Products.APRICOT, 7), 15);
		  Message message46 = new Message(new Sale(Products.PLUM, 3), 25);
		  Message message47 = new Message(new Sale(Products.PINEAPPLE, 35), 10 , new Adjustment(Operation.ADD , 5));
		  Message message48 = new Message(new Sale(Products.APRICOT, 3), 20 , new Adjustment(Operation.SUBSTRACT , 2));
		  Message message49 = new Message(new Sale(Products.ORANGE, 8), 30 , new Adjustment(Operation.SUBSTRACT , 2));
		  Message message50 = new Message(new Sale(Products.PINEAPPLE, 35), 10 );
		  Message message51 = new Message(new Sale(Products.CHERRY, 20), 50 );
	
		  messages.add(message1);		  
		  messages.add(message2);
		  messages.add(message3);
		  messages.add(message4);
		  messages.add(message5);
		  messages.add(message6);
		  messages.add(message7);
		  messages.add(message8);
		  messages.add(message9);
		  messages.add(message10);		
		  messages.add(message11);		  
		  messages.add(message12);
		  messages.add(message13);
		  messages.add(message14);
		  messages.add(message15);
		  messages.add(message16);
		  messages.add(message17);
		  messages.add(message18);
		  messages.add(message19);
		  messages.add(message20);
		  messages.add(message21);		  
		  messages.add(message22);
		  messages.add(message23);
		  messages.add(message24);
		  messages.add(message25);
		  messages.add(message26);
		  messages.add(message27);
		  messages.add(message28);
		  messages.add(message29);
		  messages.add(message30);
		  messages.add(message31);		  
		  messages.add(message32);
		  messages.add(message33);
		  messages.add(message34);
		  messages.add(message35);
		  messages.add(message36);
		  messages.add(message37);
		  messages.add(message38);
		  messages.add(message39);
		  messages.add(message40);
		  messages.add(message41);		  
		  messages.add(message42);
		  messages.add(message43);
		  messages.add(message44);
		  messages.add(message45);
		  messages.add(message46);
		  messages.add(message47);
		  messages.add(message48);
		  messages.add(message49);
		  messages.add(message50);
		  messages.add(message51);
		
		  
		  return messages;
		
	}

}
