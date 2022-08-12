package test.com;

import test.com.Button.OnClickListener;

public class Test01Main {
    OnClickListener onClickListener = new Button.OnClickListener() {
        @Override
        public void onClick() {
            System.out.println("onClick()...111");
        }
    };

    public static void main(String[] args) {
        System.out.println("Hello inner interface");

        Button btn = new Button();
        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("onClick()...111");
            }
        });
        btn.touch();

        btn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("onClick()...222");
            }
        });

        btn.touch();
    }
}