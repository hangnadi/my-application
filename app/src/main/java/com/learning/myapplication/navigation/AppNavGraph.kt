package com.learning.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.learning.myapplication.utils.bottomNavGraph

@Composable
fun AppNavGraph(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier
) {
    val context = LocalContext.current.applicationContext

    NavHost(
        navController = navController,
        startDestination = AppRoute.BottomScreens.route,
        modifier = modifier
    ) {
        // Bottom Navigation Screens
        bottomNavGraph(navController)

        // App Bar Screens
        /*
        composable(AppRoute.CustomTopAppBar.route) {
            CustomTopAppBarScreen()
        }

        composable(CenterAlignedTopAppBar.route) {
            CenterAlignedTopAppBarScreen()
        }

        composable(MediumAppBar.route) {
            MediumTopAppBarScreen()
        }

        composable(LargeAppBar.route) {
            LargeTopAppBarScreen()
        }

        // Animation Components Screen
        composable(BasicAnimation.route) {
            BasicAnimationScreen()
        }

        composable(ModifierAnimation.route) {
            ModifierAnimationScreen()
        }

        composable(TransitionAnimation.route) {
            TransitionScreen()
        }

        composable(DominoEffect.route) {
            DominoEffectScreen()
        }

        composable(ElasticEffect.route) {
            ElasticEffectScreen()
        }

        composable(InteractiveScrollTimeline.route) {
            InteractiveScrollTimelineScreen()
        }

        composable(ShapeMorphing.route) {
            ShapeMorphingAnimationScreen()
        }

        composable(Snowfall.route) {
            SnowfallAnimationScreen()
        }

        composable(StateTransition.route) {
            StateTransitionScreen()
        }

        composable(WaveformVisual.route) {
            WaveformVisualizerScreen()
        }

        // Button Components Screen
        composable(BasicBtn.route) {
            BasicButtonScreen { context.showToast("Hello!") }
        }
        composable(FilledTonalBtn.route) {
            FilledTonalButtonScreen { context.showToast("Hello") }
        }
        composable(FilledTonalIconBtn.route) {
            FilledTonalIconButtonScreen { context.showToast("Hello") }
        }
        composable(FABtn.route) {
            FloatingActionButtonScreen { context.showToast("Hello!") }
        }
        composable(ElevatedBtn.route) {
            ElevatedButtonScreen { context.showToast("Hello!") }
        }
        composable(IconBtn.route) {
            IconButtonScreen { context.showToast("Hello!") }
        }
        composable(AppRoute.OutlinedBtn.route) {
            OutlinedButtonScreen { context.showToast("Hello!") }
        }
        composable(TextBtn.route) {
            TextButtonScreen { context.showToast("Hello!") }
        }

        // Cards Screens
        composable(BasicCard.route) {
            BasicCardScreen()
        }

        composable(FilledCard.route) {
            FilledCardScreen()
        }

        composable(OutlinedCard.route) {
            OutlinedCardScreen()
        }

        // Checkout Screens
        composable(CheckoutSample1.route) {
            CheckOutScreen1()
        }

        // Dialog Screens
        composable(DialogBasic.route) {
            DialogBasicScreen()
        }

        composable(DialogWithText.route) {
            DialogWithTextScreen()
        }

        composable(DialogWithImageAndText.route) {
            DialogWithImageAndTextScreen()
        }

        composable(DialogWithTextField.route) {
            DialogWithTextFieldScreen()
        }

        composable(DialogAlert.route) {
            AlertDialogExample()
        }

        // Layout Screens
        composable(ConstraintLayoutBasic.route) {
            ConstraintLayoutBasicScreen()
        }

        // List Screens
        composable(OneLineListItem.route) {
            OneLineListItemScreen()
        }

        // Text & Typo Screens
        composable(BasicText.route) {
            BasicTextScreen()
        }

        composable(MultipleTextStyle.route) {
            MultipleTextStyleScreen()
        }

        composable(TextLink.route) {
            TextLinkScreen()
        }

        // Splash Screens
        composable(SplashSample1.route) {
            SplashScreen1()
        }

        // Authentication Screens
        composable(LogIn1.route) {
            LogInScreen1()
        }
        composable(LogIn2.route) {
            LogInScreen2()
        }

        // Dashboard Screens
        composable(FoodieHome.route) {
            FoodieHomeScreen()
        }
        */

    }
}


