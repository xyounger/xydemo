package com.xyoung.baselibrary.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by xiangyang on 2018/5/30.
 */

public class BitmapUtil {

    /**
     * 质量压缩方法(对于png格式的图片不能做质量压缩，png图片的无损压缩也只是去掉图片的额外信息如地址、时间)
     *
     * @param image       压缩的bitmap对象
     * @param requireSize 要求压缩的图片大小（kb）
     * @return
     */
    public static Bitmap compressImage(Bitmap image, int requireSize) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            // 质量压缩方法，这里100表示不压缩，把压缩后的数据存放到baos中
            image.compress(Bitmap.CompressFormat.JPEG, 100, baos);
            int options = 90;
            // 循环判断如果压缩后图片是否大于100kb,大于继续压缩
            while (baos.toByteArray().length / 1024 > requireSize) {
                // 重置baos即清空baos
                baos.reset();
                // 这里压缩options%，把压缩后的数据存放到baos中
                image.compress(Bitmap.CompressFormat.JPEG, options, baos);
                // 每次都减少10
                options -= 10;
            }
            // 把压缩后的数据baos存放到ByteArrayInputStream中
            ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());
            // 把ByteArrayInputStream数据生成图片
            Bitmap bitmap = BitmapFactory.decodeStream(isBm, null, null);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return image;
    }
}
