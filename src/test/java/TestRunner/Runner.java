package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;

//1-テストの実行を開始するテストランナークラスについて通知
//2-機能ファイル、ステップ定義などのCucumberテストのプロパティを設定するために使用
@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue={"StepDefinition"})
public class Runner {

}
