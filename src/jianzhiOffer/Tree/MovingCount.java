package jianzhiOffer.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author shillu
 * @version 1.0
 * @date 2022/4/21 22:30
 */
public class MovingCount {

    public int movingCount(int m, int n, int k) {
        if(k == 0)
            return 1;

        Queue<int[]> queue = new LinkedList<int[]>();
        // 设置向右和向下的方向数组
        int[] dx = {0, 1};
        int[] dy = {1, 0};
        boolean[][] vis = new boolean[m][n];
        queue.offer(new int[]{0, 0});
        vis[0][0] = true;
        int ans = 1;
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int i = 0; i < 2; i++) {
                int tx = dx[i] + x;
                int ty = dy[i] + y;
                if (tx < 0 || tx >= m || ty >= n || vis[tx][ty] || get(tx) + get(ty) > k)
                    continue;

                queue.offer(new int[]{tx, ty});
                vis[tx][ty] = true;
                ans++;
            }
        }

        return ans;
    }

    private int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}
