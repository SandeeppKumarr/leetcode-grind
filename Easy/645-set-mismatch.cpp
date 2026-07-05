/**
 * LeetCode #645: Set Mismatch
 * Difficulty: Easy
 * Language: C++
 * Runtime: N/A
 * Memory: N/A
 * Date: 2026-07-05T12:38:37.113Z
 */


        // Determine which is duplicate
        for (int num : nums) {
            if (num == x)
                return new int[]{x, y};
        }

        return new int[]{y, x};
    }
}