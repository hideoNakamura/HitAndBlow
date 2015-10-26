package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * スタート画面からのリクエストに対しての処理を行うコントローラー
 * プレイヤーが作成したプログラムを呼び出し、3ストライクになった時点で、結果画面に遷移する
 */
@WebServlet("/StartViewController")
public class StartViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * コンストラクタ
     */
    public StartViewController() {
        super();
    }

	/**
	 * Getメソッド
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		// TODO:startView.jspのパラメータ取得処理
//		String xxx = request.getParameter("");

		// TODO:各Playerクラス呼び出し処理


		// TODO:各処理の結果情報をセット
//		request.setAttribute("", "");

		// リクエストディスパッチャ取得・結果発表へ遷移
		RequestDispatcher reqDisp = request.getRequestDispatcher("/view/resultView.jsp");
		reqDisp.forward(request, response);
	}

	/**
	 * Postメソッド
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
