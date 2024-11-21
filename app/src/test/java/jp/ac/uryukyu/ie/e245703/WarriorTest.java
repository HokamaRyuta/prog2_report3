package jp.ac.uryukyu.ie.e245703;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /*
     * Warriorクラスからオブジェクトを生成し、attackWithWeponSkillを3回実行し、3回ともattackの150%ダメージになっていることを確認する。
     * 検証手順
     * (1) 戦士と敵を準備。今回は戦士の攻撃力を100、敵のHPを500に設定している。
     * (2) int型の変数beforeHPを用意。beforeHPに敵の現在HPを代入して、戦士がウェポンスキルで攻撃した後に、beforeHPと攻撃を受けた敵のHPの差が、戦士の攻撃力の150%分になっているか確認。
     *    (2)をfor文で3回繰り返し実行することで、attackWithWeponSkill()が正しく動作しているか確認する。
     */
    @Test
    void attackWithWeponSkill(){
        int beforeHP;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
        Enemy slime = new Enemy("スライムもどき", 500, 10);

        for(int i = 1; i <= 3; i++){
            beforeHP = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            assertEquals(demoWarrior.getAttack() * 1.5, beforeHP - slime.getHitPoint());
        }
    }
}