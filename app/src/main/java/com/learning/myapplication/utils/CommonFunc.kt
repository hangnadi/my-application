package com.learning.myapplication.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import com.learning.myapplication.navigation.AppRoute
import com.learning.myapplication.data.BottomNavItem

object CommonFunc {
    fun getNavigationItems(): List<BottomNavItem> {
        return listOf(
            BottomNavItem(
                title = "Screens",
                selectedIcon = Icons.Default.Home,
                icon = Icons.Default.Home,
                route = AppRoute.BottomScreens.route
            ),
            BottomNavItem(
                title = "Apps",
                selectedIcon = Icons.Default.Person,
                icon = Icons.Default.Person,
                route = AppRoute.BottomApps.route
            ),
            BottomNavItem(
                title = "Bookmark",
                selectedIcon = Icons.Default.Favorite,
                icon = Icons.Default.FavoriteBorder,
                route = AppRoute.BottomFavorites.route,
                badgeCount = 5
            ),
            BottomNavItem(
                title = "Settings",
                selectedIcon = Icons.Default.Settings,
                icon = Icons.Default.Settings,
                route = AppRoute.BottomSettings.route
            )
        )
    }
    /**
    fun getHomeCategories(): List<HomeCategory> {
        return listOf(

            HomeCategory(
                id = "animation",
                title = "Animation",
                icon = Icons.Default.Animation,
                isNew = true,
                items = listOf(
                    HomeCategoryItem(
                        title = "Basic Animation",
                        route = BasicAnimation.route
                    ),
                    HomeCategoryItem(
                        title = "Modifier.animate",
                        route = ModifierAnimation.route
                    ),
                    HomeCategoryItem(
                        title = "Transition",
                        route = TransitionAnimation.route
                    ),
                    HomeCategoryItem(
                        title = "Domino Effect",
                        route = DominoEffect.route
                    ),
                    HomeCategoryItem(
                        title = "Elastic Effect",
                        route = ElasticEffect.route
                    ),
                    HomeCategoryItem(
                        title = "Interactive Scroll Effect",
                        route = InteractiveScrollTimeline.route
                    ),
                    HomeCategoryItem(
                        title = "Shape Morphing Effect",
                        route = ShapeMorphing.route
                    ),
                    HomeCategoryItem(
                        title = "Snowfall Effect",
                        route = Snowfall.route
                    ),
                    HomeCategoryItem(
                        title = "State Transition Effect",
                        route = StateTransition.route
                    ),
                    HomeCategoryItem(
                        title = "Wave Form Visual Effect",
                        route = WaveformVisual.route
                    ),
                )
            ),

            HomeCategory(
                id = "app_bars",
                title = "App Bars",
                icon = Icons.Default.AppRegistration,
                isNew = true,
                items = listOf(
                    HomeCategoryItem(
                        title = "Custom Top App Bar",
                        route = CustomTopAppBar.route
                    ),
                    HomeCategoryItem(
                        title = "Center Aligned Top App Bar",
                        route = CenterAlignedTopAppBar.route
                    ),
                    HomeCategoryItem(
                        title = "Medium Top App Bar",
                        route = MediumAppBar.route
                    ),
                    HomeCategoryItem(
                        title = "Large Top App Bar",
                        route = LargeAppBar.route
                    ),
                ),
            ),

            HomeCategory(
                id = "badges",
                title = "Badges",
                icon = Icons.Default.MilitaryTech,
                items = emptyList()
            ),


            HomeCategory(
                id = "bottom_nav",
                title = "Bottom Navigation",
                icon = Icons.Default.Navigation,
                items = emptyList()
            ),

            HomeCategory(
                id = "bottom_sheet",
                title = "Bottom Sheet",
                icon = Icons.Default.ExpandLess,
                items = emptyList()
            ),

            HomeCategory(
                id = "box",
                title = "Box",
                icon = Icons.Default.CheckBoxOutlineBlank,
                items = emptyList()
            ),

            HomeCategory(
                id = "buttons",
                title = "Buttons",
                isNew = true,
                icon = Icons.Default.SmartButton,
                items = listOf(
                    HomeCategoryItem(
                        title = "Basic Button",
                        route = BasicBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Elevated Button",
                        route = ElevatedBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Filled Tonal Button",
                        route = FilledTonalBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Filled Tonal Icon Button",
                        route = FilledTonalIconBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Floating Action Button",
                        route = FABtn.route
                    ),
                    HomeCategoryItem(
                        title = "Icon Button",
                        route = IconBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Outlined Button",
                        route = OutlinedBtn.route
                    ),
                    HomeCategoryItem(
                        title = "Text Button",
                        route = TextBtn.route
                    ),
                )
            ),

            HomeCategory(
                id = "cards",
                title = "Cards",
                isNew = true,
                icon = Icons.Default.CreditCard,
                items = listOf(
                    HomeCategoryItem(
                        title = "Basic",
                        route = BasicCard.route
                    ),
                    HomeCategoryItem(
                        title = "Filled",
                        route = FilledCard.route
                    ),
                    HomeCategoryItem(
                        title = "Outlined",
                        route = OutlinedCard.route
                    ),
                ),
            ),

            HomeCategory(
                id = "carousel",
                title = "Carousel",
                icon = Icons.Default.ViewCarousel,
                items = emptyList()
            ),

            HomeCategory(
                id = "charts",
                title = "Charts",
                icon = Icons.Default.AreaChart,
                items = emptyList()
            ),

            HomeCategory(
                id = "checkbox",
                title = "Checkbox",
                icon = Icons.Default.CheckCircle,
                items = emptyList()
            ),

            HomeCategory(
                id = "chips",
                title = "Chips",
                icon = Icons.Default.NewLabel,
                items = emptyList()
            ),

            HomeCategory(
                id = "column",
                title = "Column",
                icon = Icons.Default.ViewColumn,
                items = emptyList()
            ),

            HomeCategory(
                id = "date_pickers",
                title = "Date Picker",
                icon = Icons.Default.DateRange,
                items = emptyList()
            ),

            HomeCategory(
                id = "dialogs",
                title = "Dialogs",
                isNew = true,
                icon = Icons.Default.Info,
                items = listOf(
                    HomeCategoryItem(
                        title = "Dialog Basic",
                        route = DialogBasic.route
                    ),
                    HomeCategoryItem(
                        title = "Dialog With Text",
                        route = DialogWithText.route
                    ),
                    HomeCategoryItem(
                        title = "Dialog With Text and Image",
                        route = DialogWithImageAndText.route
                    ),
                    HomeCategoryItem(
                        title = "Dialog With TextField",
                        route = DialogWithTextField.route
                    ),
                    HomeCategoryItem(
                        title = "Alert Dialog",
                        route = DialogAlert.route
                    ),
                ),
            ),

            HomeCategory(
                id = "divider",
                title = "Divider",
                icon = Icons.Default.FormatUnderlined,
                items = emptyList()
            ),

            HomeCategory(
                id = "draggable",
                title = "Draggable",
                icon = Icons.Default.DragHandle,
                items = emptyList()
            ),

            HomeCategory(
                id = "dropdown_menu",
                title = "Dropdown Menu",
                icon = Icons.Default.ArrowDropDownCircle,
                items = emptyList()
            ),

            HomeCategory(
                id = "expansion_panels",
                title = "Expandable List/ Accordion",
                icon = Icons.Default.Expand,
                items = emptyList()
            ),

            HomeCategory(
                id = "fab",
                title = "Floating Action Button",
                icon = Icons.Default.AddCircle,
                items = emptyList()
            ),

            HomeCategory(
                id = "image",
                title = "Images & Icons",
                icon = Icons.Default.Image,
                items = emptyList()
            ),

            HomeCategory(
                id = "layout",
                title = "Layout",
                isNew = true,
                icon = Icons.Default.Layers,
                items = listOf(
                    HomeCategoryItem(
                        title = "Constraint Layout Basic",
                        route = ConstraintLayoutBasic.route
                    ),
                ),
            ),

            HomeCategory(
                id = "list_column",
                title = "List (Column, Row & Grid)",
                isNew = true,
                icon = Icons.Default.ViewComfy,
                items = listOf(
                    HomeCategoryItem(
                        title = "One Line List Item",
                        route = OneLineListItem.route
                    ),
                ),
            ),

            HomeCategory(
                id = "menus",
                title = "Menus",
                icon = Icons.AutoMirrored.Filled.Segment,
                items = emptyList()
            ),

            HomeCategory(
                id = "modifiers",
                title = "Modifiers",
                icon = Icons.Filled.Update,
                items = emptyList()
            ),

            HomeCategory(
                id = "motion",
                title = "Motion",
                icon = Icons.Default.AutoAwesomeMotion,
                items = emptyList()
            ),

            HomeCategory(
                id = "nav_bar",
                title = "Navigation Bar",
                icon = Icons.AutoMirrored.Filled.Segment,
                items = emptyList()
            ),

            HomeCategory(
                id = "nav_drawer",
                title = "Navigation Drawer",
                icon = Icons.Filled.DensityMedium,
                items = emptyList()
            ),

            HomeCategory(
                id = "nav_rail",
                title = "Navigation Rail",
                icon = Icons.AutoMirrored.Filled.ViewSidebar,
                items = emptyList()
            ),

            HomeCategory(
                id = "popups",
                title = "Popups",
                icon = Icons.Filled.HourglassTop,
                items = emptyList()
            ),

            HomeCategory(
                id = "progress_indicator",
                title = "Progress Indicator",
                icon = Icons.Default.Downloading,
                items = emptyList()
            ),

            HomeCategory(
                id = "radio_button",
                title = "Radio Button",
                icon = Icons.Default.RadioButtonChecked,
                items = emptyList()
            ),

            HomeCategory(
                id = "row",
                title = "Row",
                icon = Icons.Default.HorizontalSplit,
                items = emptyList()
            ),

            HomeCategory(
                id = "scaffold",
                title = "Scaffold",
                icon = Icons.Default.DevicesOther,
                items = emptyList()
            ),

            HomeCategory(
                id = "search",
                title = "Search Bar",
                icon = Icons.Default.Search,
                items = emptyList()
            ),

            HomeCategory(
                id = "shapes",
                title = "Shape & Images",
                icon = Icons.Default.FormatShapes,
                items = emptyList()
            ),

            HomeCategory(
                id = "side_sheets",
                title = "Side Sheets",
                icon = Icons.Default.Slideshow,
                items = emptyList()
            ),

            HomeCategory(
                id = "sliders",
                title = "Sliders",
                icon = Icons.Default.Tune,
                items = emptyList()
            ),

            HomeCategory(
                id = "snackbar",
                title = "Snackbars",
                icon = Icons.Default.Info,
                items = emptyList()
            ),

            HomeCategory(
                id = "surface",
                title = "Surface",
                icon = Icons.Default.ViewInAr,
                items = emptyList()
            ),

            HomeCategory(
                id = "swipe_refresh",
                title = "Swipe to Refresh",
                icon = Icons.Default.Refresh,
                items = emptyList()
            ),

            HomeCategory(
                id = "switch",
                title = "Switches",
                icon = Icons.Default.ToggleOn,
                items = emptyList()
            ),

            HomeCategory(
                id = "tabs",
                title = "Tabs (Segmented button)",
                icon = Icons.Default.Tab,
                items = emptyList()
            ),

            HomeCategory(
                id = "text_typo",
                title = "Text & Typography",
                icon = Icons.Default.FormatColorText,
                items = listOf(
                    HomeCategoryItem(
                        title = "Basic Text Typo",
                        route = BasicText.route
                    ),
                    HomeCategoryItem(
                        title = "Multiple Text Style",
                        route = MultipleTextStyle.route
                    ),
                    HomeCategoryItem(
                        title = "Text Link",
                        route = TextLink.route
                    ),
                ),
            ),

            HomeCategory(
                id = "text_fields",
                title = "Text Fields",
                icon = Icons.Default.TextFields,
                items = emptyList()
            ),

            HomeCategory(
                id = "time_pickers",
                title = "Time Picker",
                icon = Icons.Default.AccessTimeFilled,
                items = emptyList()
            ),

            HomeCategory(
                id = "tooltips",
                title = "Tooltips",
                icon = Icons.AutoMirrored.Filled.HelpOutline,
                items = emptyList()
            ),


            HomeCategory(
                id = "splash",
                title = "Splash",
                isNew = true,
                icon = Icons.Default.WaterDrop,
                items = listOf(
                    HomeCategoryItem(
                        title = "Sample 1",
                        route = SplashSample1.route
                    ),
                ),
            ),

            HomeCategory(
                id = "onboard",
                title = "Onboard",
                icon = Icons.Default.SwipeLeft,
                items = emptyList()
            ),

            HomeCategory(
                id = "auth",
                title = "Authentication",
                icon = Icons.Default.Lock,
                items = listOf(
                    HomeCategoryItem(
                        title = "Log In Sample 1",
                        route = LogIn1.route
                    ),
                    HomeCategoryItem(
                        title = "Log In Sample 2",
                        route = LogIn2.route
                    ),
                ),
            ),

            HomeCategory(
                id = "profile",
                title = "Profile",
                icon = Icons.Default.Person,
                items = emptyList()
            ),

            HomeCategory(
                id = "no_item",
                title = "No Item",
                icon = Icons.Default.HideImage,
                items = emptyList()
            ),

            HomeCategory(
                id = "player",
                title = "Player",
                icon = Icons.Default.SmartDisplay,
                items = emptyList()
            ),

            HomeCategory(
                id = "timeline",
                title = "Timeline",
                icon = Icons.Default.Repartition,
                items = emptyList()
            ),

            HomeCategory(
                id = "settings",
                title = "Settings",
                icon = Icons.Default.Settings,
                items = emptyList()
            ),

            HomeCategory(
                id = "verification",
                title = "Verification",
                icon = Icons.Default.Verified,
                items = emptyList()
            ),

            HomeCategory(
                id = "cart",
                title = "Shopping Cart",
                icon = Icons.Default.ShoppingCart,
                items = emptyList()
            ),

            HomeCategory(
                id = "checkout",
                title = "Checkout",
                isNew = true,
                icon = Icons.Default.ShoppingCartCheckout,
                items = listOf(
                    HomeCategoryItem(
                        title = "Checkout Sample 1",
                        route = CheckoutSample1.route
                    ),
                )
            ),

            HomeCategory(
                id = "payment",
                title = "Payment",
                icon = Icons.Default.Payment,
                items = emptyList()
            ),

            HomeCategory(
                id = "dashboard",
                title = "Dashboard",
                isNew = true,
                icon = Icons.Default.Dashboard,
                items = listOf(
                    HomeCategoryItem(
                        title = "Foodie Home Screen",
                        route = FoodieHome.route
                    ),
                ),
            ),

            HomeCategory(
                id = "notification",
                title = "Notifications",
                icon = Icons.Default.Notifications,
                items = emptyList()
            ),

            HomeCategory(
                id = "reviews",
                title = "Reviews",
                icon = Icons.Default.Reviews,
                items = emptyList()
            ),

            HomeCategory(
                id = "filters",
                title = "Filters",
                icon = Icons.Default.FilterAlt,
                items = emptyList()
            ),

            HomeCategory(
                id = "details",
                title = "Details",
                icon = Icons.Default.Details,
                items = emptyList()
            ),

            HomeCategory(
                id = "article",
                title = "Article",
                icon = Icons.AutoMirrored.Filled.Article,
                items = emptyList()
            ),

            HomeCategory(
                id = "chat",
                title = "Chat",
                icon = Icons.Default.VideoChat,
                items = emptyList()
            ),

            HomeCategory(
                id = "about",
                title = "About",
                icon = Icons.Default.Aod,
                items = emptyList()
            ),
        )
    }
    */
}