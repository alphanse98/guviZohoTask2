public class Problem3 {
   int maxRepeating(String sequence, String word) {
//  Input: sequence = "ababc", word = "ab"
//  Output: 2    

    int count = 0; 
    String srt = word;         

    while (sequence.contains(srt)) {
        count++;
        srt = srt + word;  
    }
   return count;
}
}

// Given strings sequence and word, return the maximum k-repeating value of word in sequence.

