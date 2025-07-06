class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> row = new HashMap<>();
        Map<Integer, Set<Character>> col = new HashMap<>();
        Map<String, Set<Character>> square = new HashMap<>();

        for(int i=0; i<9; i++){
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
        }
        
        for(int r=0; r<9; r++){
            for(int c=0; c<9; c++){
                char ch = board[r][c];
                if(ch == '.') continue;

                String box = (r/3) + " " + (c/3);
                if(!square.containsKey(box)) square.put(box, new HashSet<>());

                if(row.get(r).contains(ch)) return false;
                if(col.get(c).contains(ch)) return false;
                if(square.get(box).contains(ch)) return false;

                row.get(r).add(ch);
                col.get(c).add(ch);
                square.get(box).add(ch);
            }
        }
        return true;
    }
}