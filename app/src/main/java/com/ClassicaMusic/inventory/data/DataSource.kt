package com.ClassicaMusic.inventory.data

import com.example.inventory.R


object DataSource {
    val flavors = listOf(

      "0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34"
    )

    val quantityOptions = listOf(
        Pair(R.string.one_cupcake, 10),
        Pair(R.string.six_cupcakes, 16),
        Pair(R.string.twelve_cupcakes, 33)
    )

    fun OrderUiState.toItem(): Item = Item(
        id = id,
        name = name,
        d = 15.0,
        i = 25
    )

    val score = listOf<String>(
        "0","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17",
        "18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34")






    data class Affirmation(val key : String, val drawable: Int)
    private fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation("appreciate", R.drawable.undraw_appreciate_it_re_yc8h),
            Affirmation("appreciation", R.drawable.undraw_appreciation_yy29),
            Affirmation("automobile_repair", R.drawable.undraw_automobile_repair_ywci),
            Affirmation("baby", R.drawable.undraw_baby_re_fr9r),
            Affirmation("barista", R.drawable.undraw_barista_re_fm8w),
            Affirmation("basketball", R.drawable.undraw_basketball_re_7701),
            Affirmation("beach_day", R.drawable.undraw_beach_day_cser),
            Affirmation("blooming", R.drawable.undraw_blooming_re_2kc4),
            Affirmation("buddies", R.drawable.undraw_buddies_2ae5),
            Affirmation("by_my_car", R.drawable.undraw_by_my_car_xhk6),
            Affirmation("cat", R.drawable.undraw_cat_s1wg),
            Affirmation("cooking_ceye", R.drawable.undraw_cooking_ceye),
            Affirmation("decorate_christmas_tree", R.drawable.undraw_decorate_christmas_tree_rmj0),
            Affirmation("doctors", R.drawable.undraw_doctors_p6aq),
            Affirmation("dog", R.drawable.undraw_dog_re_63j1),
            Affirmation("educator", R.drawable.undraw_educator_re_ju47),
            Affirmation("electricity", R.drawable.undraw_electricity_k2ft),
            Affirmation("elements", R.drawable.undraw_elements_re_25t9),
            Affirmation("engineering_team", R.drawable.undraw_engineering_team_a7n2),
            Affirmation("experience_design", R.drawable.undraw_experience_design_re_dmqq),
            Affirmation("family", R.drawable.undraw_family_vg76),
            Affirmation("female_avatar", R.drawable.undraw_female_avatar_efig),
            Affirmation("fingerprint_login", R.drawable.undraw_fingerprint_login_re_t71l),
            Affirmation("flying_drone", R.drawable.undraw_flying_drone_u3r2),
            Affirmation("gifts", R.drawable.undraw_gifts_0ceh),
            Affirmation("good_doggy", R.drawable.undraw_good_doggy_re_eet7),
            Affirmation("grand_slam", R.drawable.undraw_grand_slam_84ep),
            Affirmation("halloween", R.drawable.undraw_halloween_re_2kq1),
            Affirmation("happy_new_year", R.drawable.undraw_happy_new_year_di92),
            Affirmation("healthy_habit", R.drawable.undraw_healthy_habit_rdky),
            Affirmation("home_run", R.drawable.undraw_home_run_oyhw),
            Affirmation("in_love", R.drawable.undraw_in_love_993n),
            Affirmation("landscape_photographer", R.drawable.undraw_landscape_photographer_156c),
            Affirmation("love_is", R.drawable.undraw_love_is_in_the_air_4uud),
            Affirmation("make_it_rain", R.drawable.undraw_make_it_rain_re_w9pc),
            Affirmation("male_avatar", R.drawable.undraw_male_avatar_g98d),
            Affirmation("mindfulness", R.drawable.undraw_mindfulness_6xt3),
            Affirmation("passing", R.drawable.undraw_passing_by_0un9),
            Affirmation("pic_profile", R.drawable.undraw_pic_profile_re_7g2h),
            Affirmation("profile_pic", R.drawable.undraw_profile_pic_re_iwgo),
            Affirmation("pumpkin", R.drawable.undraw_pumpkin_re_bm46),
            Affirmation("ready_for_waves", R.drawable.undraw_ready_for_waves_vlke),
            Affirmation("reminder", R.drawable.undraw_reminder_re_fe15),
            Affirmation("running", R.drawable.undraw_running_wild_h6ao  ),
            Affirmation("scientist", R.drawable.undraw_scientist_klqc),
            Affirmation("snow_games", R.drawable.undraw_snow_games_tq9r),
            Affirmation("summer", R.drawable.undraw_summer_1wi4),
            Affirmation("team", R.drawable.undraw_team_up_re_84ok),
            Affirmation("traveling", R.drawable.undraw_traveling_qio0),
            Affirmation("winter_skating", R.drawable.undraw_winter_skating_re_qouk),
            Affirmation("woman", R.drawable.undraw_woman_re_afr8)
        )
    }

    data class Ask(val key : String, val drawable: Int)
    private fun loadAsk(): List<Ask> {
        return listOf<Ask>(
            Ask("appreciate", R.drawable.undraw_appreciate_it_re_yc8h),
            Ask("appreciation", R.drawable.undraw_appreciation_yy29),
            Ask("automobile_repair", R.drawable.undraw_automobile_repair_ywci),
            Ask("baby", R.drawable.undraw_baby_re_fr9r),
            Ask("barista", R.drawable.undraw_barista_re_fm8w),
            Ask("basketball", R.drawable.undraw_basketball_re_7701),
            Ask("beach_day", R.drawable.undraw_beach_day_cser),
            Ask("blooming", R.drawable.undraw_blooming_re_2kc4),
            Ask("buddies", R.drawable.undraw_buddies_2ae5),
            Ask("by_my_car", R.drawable.undraw_by_my_car_xhk6),
            Ask("cat", R.drawable.undraw_cat_s1wg),
            Ask("cooking_ceye", R.drawable.undraw_cooking_ceye),
            Ask("decorate_christmas_tree", R.drawable.undraw_decorate_christmas_tree_rmj0),
            Ask("doctors", R.drawable.undraw_doctors_p6aq),
            Ask("dog", R.drawable.undraw_dog_re_63j1),
            Ask("educator", R.drawable.undraw_educator_re_ju47),
            Ask("electricity", R.drawable.undraw_electricity_k2ft),
            Ask("elements", R.drawable.undraw_elements_re_25t9),
            Ask("engineering_team", R.drawable.undraw_engineering_team_a7n2),
            Ask("experience_design", R.drawable.undraw_experience_design_re_dmqq),
            Ask("family", R.drawable.undraw_family_vg76),
            Ask("female_avatar", R.drawable.undraw_female_avatar_efig),
            Ask("fingerprint_login", R.drawable.undraw_fingerprint_login_re_t71l),
            Ask("flying_drone", R.drawable.undraw_flying_drone_u3r2),
            Ask("gifts", R.drawable.undraw_gifts_0ceh),
            Ask("good_doggy", R.drawable.undraw_good_doggy_re_eet7),
            Ask("grand_slam", R.drawable.undraw_grand_slam_84ep),
            Ask("halloween", R.drawable.undraw_halloween_re_2kq1),
            Ask("happy_new_year", R.drawable.undraw_happy_new_year_di92),
            Ask("healthy_habit", R.drawable.undraw_healthy_habit_rdky),
            Ask("home_run", R.drawable.undraw_home_run_oyhw),
            Ask("in_love", R.drawable.undraw_in_love_993n),
            Ask("landscape_photographer", R.drawable.undraw_landscape_photographer_156c),
            Ask("love_is", R.drawable.undraw_love_is_in_the_air_4uud),
            Ask("make_it_rain", R.drawable.undraw_make_it_rain_re_w9pc),
            Ask("male_avatar", R.drawable.undraw_male_avatar_g98d),
            Ask("mindfulness", R.drawable.undraw_mindfulness_6xt3),
            Ask("passing", R.drawable.undraw_passing_by_0un9),
            Ask("pic_profile", R.drawable.undraw_pic_profile_re_7g2h),
            Ask("profile_pic", R.drawable.undraw_profile_pic_re_iwgo),
            Ask("pumpkin", R.drawable.undraw_pumpkin_re_bm46),
            Ask("ready_for_waves", R.drawable.undraw_ready_for_waves_vlke),
            Ask("reminder", R.drawable.undraw_reminder_re_fe15),
            Ask("running", R.drawable.undraw_running_wild_h6ao  ),
            Ask("scientist", R.drawable.undraw_scientist_klqc),
            Ask("snow_games", R.drawable.undraw_snow_games_tq9r),
            Ask("summer", R.drawable.undraw_summer_1wi4),
            Ask("team", R.drawable.undraw_team_up_re_84ok),
            Ask("traveling", R.drawable.undraw_traveling_qio0),
            Ask("winter_skating", R.drawable.undraw_winter_skating_re_qouk),
            Ask("woman", R.drawable.undraw_woman_re_afr8)
        )
    }


}
