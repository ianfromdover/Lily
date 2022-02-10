package lily.task;

import lily.LilyException;

import java.io.Serializable;

/**
 * A parent class which Todo, Events and Deadlines derive from
 * 
 * @author Hong Yi En, Ian
 * @version Jan 2022 (AY21/22 Sem 2)
 */
public class Task implements Serializable{
    private String desc;    
    private boolean isDone;    

    /**
     * Create a Task.
     * 
     * @param desc What the Task is about.
     */
    public Task(String desc) {
        this.desc = desc;
        this.isDone = false;
    }

    /**
     * Returns the description of the task.
     * 
     * @return The description of the Task as a String.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Mark the task as done.
     * 
     * @throws LilyException If user has finished the task already.
     */
    public void mark() throws LilyException {
        if (isDone) {
            throw new LilyException("bro this task is already marked.");
        } else {
            isDone = true;
        }
    }

    /**
     * Mark the task as undone.
     * 
     * @throws LilyException If user hasn't done the task yet.
     */
    public void unmark() throws LilyException {
        if (!isDone) {
            throw new LilyException("bro you haven't done this.");
        } else {
            isDone = false;
        }
    }

    /**
     * Gives a string which indicates whether the task is done or not.
     * 
     * @return X if the task is done.
     */
    public String getStatusIcon() {
        return "[" + (isDone ? "X" : " ") + "] ";
    }

    /**
     * Returns the Task's description and whether it is done
     * 
     * @return Task in the form of "[ ] Description"
     */
    @Override
    public String toString() {
        return this.getStatusIcon() + this.desc;
    }
}