package scaler.DSProblem_01_12_2023;

import java.util.ArrayList;

public class MergeIntervals {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int n = intervals.size();
        ArrayList<Interval> intervalArrayList = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(intervals.get(i).end < newInterval.start){
                intervalArrayList.add(intervals.get(i));
            }else if(intervals.get(i).start > newInterval.end){
                intervalArrayList.add(newInterval);
                for(int j=i;j<n;j++){
                    intervalArrayList.get(j);
                }
                return intervalArrayList;
            }else{
                newInterval.start = Math.max(intervals.get(i).start, newInterval.start);
                newInterval.end = Math.max(intervals.get(i).end, newInterval.end);

            }
        }
        intervalArrayList.add(newInterval);
        return intervalArrayList;
    }
}


