//
//  AppDelegate.swift
//  iosApp
//
//  Created by TBC on 29.08.21.
//  Copyright © 2021 orgName. All rights reserved.
//

import Foundation
import UIKit
import shared


class AppDelegate: NSObject, UIApplicationDelegate {
    func application(_ application: UIApplication, didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
        print(">> your code here !!")
        KoinKt.doInitKoin { Koin_coreKoinApplication in
            
        }
        return true
    }
    
}
