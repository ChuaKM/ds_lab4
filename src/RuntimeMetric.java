/* Koon Chua
 * EN 605.202.81
 * Lab 4
 *
 *  Slightly modified version of distributed RuntimeMetric
 *
 *  $Id:  RuntimeMetric.java $
 *
 *  Copyright 2011, The Johns Hopkins University Whiting School of Engineering
 *      All rights reserved.
 *      This material may be used, modified and reproduced by faculty,
 *      staff, and students of The Johns Hopkins University for instruction, 
 *      evaluation, and grading purposes.  For any other permission, please 
 *      contact The Johns Hopkins University Whiting School of Engineering.
 */

/**
 *  Provides a matched set to determine Big-O runtime metrics.
 *  Edited copy of RuntimeMetric Class from Lab 0.
 */
public class RuntimeMetric {
    private long time_stop;
    private long start_time;
    
    /**
     *  A single constructor is used to create each metric.  The metric
     *  cannot be changed after creation.
     *  @param t The time it took to solve the problem.
     */
    public RuntimeMetric (long t) {
        start_time = t;
    }

    /**
     *  Fetches the time it took to solve the problem.
     *  @return The time measured in nanoseconds.
     */
    public long getRuntime(long curr_time) {
        return curr_time - start_time;
    }
    
    /**
     *  Sets end time.
     * @param end_time the end runtime
     */
    public void setEndTime(long end_time) {
        time_stop = end_time;
    }

    /**
     * Calculates total runtime
     * @return total runtime
     */
    public long totalTime() {
        return time_stop - start_time;
    }

}
