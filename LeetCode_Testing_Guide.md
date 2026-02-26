🛠️ 2. 如何輸入與測試測資 (三步驟)
第一步：在 MySolution.java 引入工具
在檔案最上方加入這兩行，才能讀到你寫好的工具類別：

package solution;
import utils.ListNode;    // 引入節點定義
import utils.ListUtils;   // 

第二步：編寫 main 函式輸入測資
在你的解題類別中，加入以下 main 區塊。這就是你輸入測試資料的地方：

public static void main(String[] args) {
    // 1. 設定題目給的測資陣列
    int[] inputData = {1, 2, 3, 4, 5}; 

    // 2. 使用工具將陣列轉成 ListNode 頭節點 (Head)
    ListNode head = ListUtils.createList(inputData);

    // 3. 呼叫你的演算法
    MySolution sol = new MySolution();
    ListNode result = sol.reverseList(head); // 假設題目是反轉鏈結

    // 4. 印出結果確認是否正確
    System.out.print("測試結果：");
    ListUtils.printList(result);
}

第三步：執行程式在 VS Code 中按下 F5 或點擊 main 函式上方的 "Run" 按鈕。觀察下方「控制台 (Terminal)」的輸出結果。

📝 3. 常用工具語法速查表功能程式碼指令備註建立鏈結ListUtils.createList(new int[]{...})將陣列轉為節點結構印出鏈結ListUtils.printList(head)在控制台看 1 -> 2 -> null手動建立節點ListNode n = new ListNode(5);建立一個值為 5 的節點連接節點node1.next = node2;將指標指向下一個節點

⚠️ 常見紅字報錯 (Troubleshooting)
"ListNode cannot be resolved": * 檢查檔案最上方是否有 import utils.ListNode;。

檢查 ListNode.java 第一行是否有 package utils;。

"The package ... does not match":

Java 對資料夾路徑很嚴格。如果檔案在 utils 資料夾裡，第一行必須是 package utils;。

無法執行 main：

確保你的 main 寫法完全正確：public static void main(String[] args)。