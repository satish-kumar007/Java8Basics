package scaler.DSProblem_01_12_2023;

import java.util.*;

public class MergeOverlappingIntervals {

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, new IntervalComp());

        //res is the ArrayList that we will return
        ArrayList<Interval> res;

        Interval inter;
        int n = intervals.size();
        res = new ArrayList<>();

        for (int i = 0; i < n;) {
            // making a new segment
            inter = new Interval(intervals.get(i).start, intervals.get(i).end);
            Interval next;
            i++;
            while (i < n) {
                next = intervals.get(i);
                // Checking if i-th element falls in the current segment
                if (overlap(inter, next)) {
                    // adding i-th element to the current segment
                    inter.end = Math.max(inter.end, next.end);
                    i++;
                } else {
                    break;
                }
            }
            // adding current segment to our answer.
            res.add(inter);
        }
        return res;
    }
    private boolean overlap(Interval int1, Interval int2) {
        if (int1.end >= int2.start && int1.start <= int2.end)
            return true;
        return false;
    }

    private class IntervalComp implements Comparator<Interval> {
        @Override
        public int compare(Interval interval1, Interval interval2) {
            int cmp =  Integer.compare(interval1.start, interval2.start);
            if (cmp != 0)
                return cmp;
            cmp = Integer.compare(interval1.end, interval2.end);
            return cmp;
        }
    }



}
class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
  }

