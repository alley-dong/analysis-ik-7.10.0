package org.wltea.analyzer.dic;
/**
  *@author DongCL
  *@date 2024/5/9 13:35
*/
public class HotDict implements Runnable{
    @Override
    public void run() {
        while (true){
            // 去重新加载词典
            Dictionary.getSingleton().reLoadMainDict();
        }
    }
}
