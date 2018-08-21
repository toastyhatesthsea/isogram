import java.util.HashMap;

class IsogramChecker {

    public HashMap<Character, Integer> values;


    boolean isIsogram(String phrase) {

        values = new HashMap<>();
        boolean answer = true;

        for(int i=0; i<phrase.length() && answer; i++)
        {
            Character letter = phrase.charAt(i);

            if (!letter.equals(' ') && !letter.equals('-'))
            {
                Integer hasValue = values.put(phrase.charAt(i), 1);

                if (hasValue != null)
                {
                    answer = false;
                }
            }
        }
        return answer;

    }

    public void convertToHash(String phrase)
    {
        values = new HashMap<>();

    }

}
