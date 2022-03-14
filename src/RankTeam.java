import java.util.*;

public class RankTeam {

    public static String byVotes(String[] votes){
        HashMap<Character, Integer> voteCount = new HashMap<>();
        for(String sV:votes){
            for(int i = 0; i< sV.length(); i++){
                char v = sV.charAt(i);
                if(voteCount.containsKey(v)){
                    voteCount.put(v, (voteCount.get(v)+i+1));
                }else {
                    voteCount.put(v, i+1);
                }
            }
        }
        class Data{
            Character c;
            Integer votes;

            public Data(Character key, Integer value) {
                this.c = key;
                this.votes = value;
            }
        }
        ArrayList<Data> list = new ArrayList<>();
        for(Map.Entry<Character, Integer> entry:voteCount.entrySet()){
            list.add(new Data(entry.getKey(),entry.getValue()));
        }
        list.sort(new Comparator<Data>() {
            @Override
            public int compare(Data o1, Data o2) {
                return o1.votes - o2.votes;
            }
        });
        char[] chars = new char[list.size()];
        for(int i =0; i<list.size(); i++){
            chars[i] = list.get(i).c;
        }
        return new String(chars);
    }
}

/*
In a special ranking system, each voter gives a rank from highest to lowest to all teams participated in the competition.

The ordering of teams is decided by who received the most position-one votes. If two or more teams tie in the first position, we consider the second position to resolve the conflict, if they tie again, we continue this process until the ties are resolved. If two or more teams are still tied after considering all positions, we rank them alphabetically based on their team letter.

Given an array of strings votes which is the votes of all voters in the ranking systems. Sort all teams according to the ranking system described above.

Return a string of all teams sorted by the ranking system.



Example 1:

Input: votes = ["ABC","ACB","ABC","ACB","ACB"]
Output: "ACB"
Explanation: Team A was ranked first place by 5 voters. No other team was voted as first place so team A is the first team.
Team B was ranked second by 2 voters and was ranked third by 3 voters.
Team C was ranked second by 3 voters and was ranked third by 2 voters.
As most of the voters ranked C second, team C is the second team and team B is the third.
Example 2:

Input: votes = ["WXYZ","XYZW"]
Output: "XWYZ"
Explanation: X is the winner due to tie-breaking rule. X has same votes as W for the first position but X has one vote as second position while W doesn't have any votes as second position.
Example 3:

Input: votes = ["ZMNAGUEDSJYLBOPHRQICWFXTVK"]
Output: "ZMNAGUEDSJYLBOPHRQICWFXTVK"
Explanation: Only one voter so his votes are used for the
 */
