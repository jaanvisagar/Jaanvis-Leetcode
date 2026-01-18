class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int count1 = 0;
        int count0 = 0;
        for (int stu : students) {
            if (stu == 0)
            count0++; 
            else count1++;
        }
        for (int sandwhich : sandwiches) {
            if (sandwhich == 0) {
                if (count0 == 0) break;
                count0--;
            }
            else {
                if (count1 == 0) break;
                count1--;

            } 
        }
        return count0 + count1;
    }
}