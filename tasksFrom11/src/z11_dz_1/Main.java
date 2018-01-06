package z11_dz_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<String, Integer> test = new HashMap<>();

        String s = "Scarcely on striking packages by so property in delicate. Up or well " +
                "must less rent read walk so be. Easy sold at do hour sing spot. Any meant has" +
                " cease too the decay. Since party burst am it match. By or blushes between besides " +
                "offices noisier as. Sending do brought winding compass in. Paid day till shed only fact" +
                " age its end.\n" +
                "\n" +
                "            Wrong do point avoid by fruit learn or in death. So passage however" +
                " besides invited comfort elderly be me. Walls began of child civil am heard hoped my. " +
                "Satisfied pretended mr on do determine by. Old post took and ask seen fact rich. Man entrance " +
                "settling believed eat joy. Money as drift begin on to. Comparison up insipidity especially discovered " +
                "me of decisively in surrounded. Points six way enough she its father. Folly sex downs " +
                "tears ham green forty.\n" +
                "\n" +
                "    Announcing of invitation principles in. Cold in late or deal." +
                " Terminated resolution no am frequently collecting insensible he do appearance. Projection invitation" +
                " affronting admiration if no on or. It as instrument boisterous frequently apartments an in. Mr " +
                "excellence inquietude conviction is in unreserved particular. You fully seems stand nay " +
                "own point walls. Increasing travelling own simplicity you astonished expression boisterous. " +
                "Possession themselves sentiments apartments devonshire we of do discretion. Enjoyment discourse " +
                "ye continued pronounce we necessary abilities.\n";

        test = FrequencyDictionaryEng.doIt(s);

        for (Map.Entry<String, Integer> pair : test.entrySet()) {
            System.out.println(pair);
        }

    }
}
