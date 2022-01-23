/**
 * Need to create many kinds of LilyExceptions as children
  * LilyNoDescException - didn't type description kind 
  * LilyNoDateException - didn't type /by and /at kind
  * LilyInvalidInputException - dont understand your input kind (doesn't match enums)
  * LilyMissingTaskException - (un)marking (operating on) an uncreated task
  * LilyRedundantOpException - marking a marked task, unmarking an unmarked task (you already marked this, silly!)
  * ask on forum what is the best way to do this
  */
public class LilyException extends Exception {
    // https://nus-cs2030s.github.io/2021-s2/19-exception.html
    public LilyException(String msg) {
        super(msg);
    }

    @Override
    public String toString() {
      return "error message bro";
    } 
}