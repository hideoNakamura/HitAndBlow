package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ManagementService;
import dto.HabResultDto;
import dto.QuestionDto;

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

		// 結果用フラグ
		boolean reFlg = true;
		// TODO:startView.jspのパラメータ取得処理
		// チーム名
//		String teamNm = request.getParameter("teamNm");
		// Player親クラス
//		 Parent parent = request.getParameter("");

		// TODO:仕様が未確定なのでとりあえず必要そうなやつをインスタンス生成
		/*
		 * qDto  :クエスチョン情報格納DTO
		 * habDto:HitAndBlow結果格納DTO
		 * mSrv  :解答生成サービス
		 */
		QuestionDto qDto = new QuestionDto();
		HabResultDto habDto = new HabResultDto();
		ManagementService mSrv = new ManagementService();

		// 解答が一致するまでループ
		while(reFlg){
			// TODO:各Playerクラス呼び出し処理
//			 qDto = parent.method();

			habDto = mSrv.createHabResult(qDto);

			// TODO:仕様が未確定なので適当に。
			if(habDto == null){
				reFlg = false;
			}
		}


		// TODO:各処理の結果情報をセット
		// チーム名
//		request.setAttribute("teamNm", teamNm);
		// 正解までにかかった回数
//		request.setAttribute("count", habDto.getXXXXX);
		// 正解までにかかった時間
//		request.setAttribute("time", habDto.getXXXXX);

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
