package com.kristen.motivationalquotes;

import java.util.Random;

public class MotivationalQuote {
	// Member variables (properties about the object)
	public String[] mQuotes = {
    		"Our greatest weakness lies in giving up. The most certain way to succeed is always to try just one more time. -Thomas A. Edison",
    		"You are never too old to set another goal or to dream a new dream. -C. S. Lewis",
    		"Every strike brings me closer to the next home run. ÐBabe Ruth",
    		"I have not failed. I've just found 10,000 ways that won't work. -Thomas A. Edison",
    		"The distance between insanity and genius is measured only by success. -Bruce Feirstein",
    		"When you stop chasing the wrong things you give the right things a chance to catch you. -Lolly Daskal",
    		"Don't be afraid to give up the good to go for the great. -John D. Rockefeller",
    		"No masterpiece was ever created by a lazy artist. -Anonymous",
    		"Do one thing every day that scares you. -Anonymous",
    		"A diamond is merely a lump of coal that did well under pressure. -Unknown",
    		"I am not discouraged, because every wrong attempt discarded is another step forward. -Thomas Edison",
    		"A failure establishes only this, that our determination to succeed was not strong enough. -John Christian Bovee",
    		"The men who try to do something and fail are infinitely better than those who try to do nothing and succeed. -Lloyd Jones",
    		"The will to win, the desire to succeed, the urge to reach your full potential: these are the keys that will unlock the door to personal excellence. -Eddie Robinson",
    		"When the world says, \"Give up,\" Hope whispers, \"Try it one more time.\" -Unknown",
    		"Our greatest glory is not in never failing, but in rising up every time we fail. -Ralph Waldo Emerson",
    		"Nothing can stop the man with the right mental attitude from achieving his goal; nothing on earth can help the man with the wrong mental attitude. -Thomas Jefferson",
    		"Success is the good fortune that comes from aspiration, desperation, perspiration and inspiration. -Evan Esar",
    		"Persistent people begin their success where others end in failure. -Edward Eggleston" };
	
	// Methods (abilities: things it can do)
	public String getAQuote() {
            String quote = "";
            
            // Randomly select one of three answers: Yes, No, or Maybe
            Random randomGenerator = new Random(); // Construct a new Random number generator
            int randomNumber = randomGenerator.nextInt(mQuotes.length);
            
            quote = mQuotes[randomNumber];
            
            return quote;
	}

}
