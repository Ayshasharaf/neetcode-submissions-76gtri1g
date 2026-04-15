class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new  StringBuilder();
        for( String str : strs){
            encoded.append(str.length()).append("#").append(str);
        }
        return encoded.toString();

    }

    public List<String> decode(String s) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            int j = i;
            while (s.charAt(j) != '#'){
                j++;
            }
            String number = s.substring(i, j);
            int length = Integer.parseInt(number);

            int start = j + 1;
            int end = start + length;
            String word = s.substring(start, end);

            result.add(word);
            i = end;
        }
        return result;

    }
}
