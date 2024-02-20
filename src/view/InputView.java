package view;

import java.io.*;

public final class InputView {
    private InputView() {
    }

    public static String inputCount() throws IOException {
        System.out.println("등록할 상품의 개수를 입력해주세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static String[] inputProductAndPrice() throws IOException {
        System.out.println("상품의 이름과 가격을 입력해 주세요.(이름과 가격은 빈칸을 기준으로 구분)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().split(" ");
    }

    public static String getUserAction() throws IOException {
        System.out.println("원하시는 동작을 선택해주세요. (등록 / 읽기 / 제거)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static String getProductNameToRemove() throws IOException {
        System.out.println("제거할 상품의 이름을 입력해주세요.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

    public static String[] inputProductAndCount() throws IOException {
        System.out.println("상품의 이름과 개수를 입력해주세요.(빈칸을 기준으로 구분)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().split(" ");
    }
}
