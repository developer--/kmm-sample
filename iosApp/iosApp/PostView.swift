//
//  PostView.swift
//  iosApp
//
//  Created by TBC on 29.08.21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI
import shared
import UIKit

struct PostView: View {
    var post: PostUi
    var body: some View {
        HStack {
            post.image
                .resizable()
                .foregroundColor(Color.green)
                .frame(width: 50, height: 50)
            Text(post.title)
            Spacer()
        }
        
    }
}

struct PostUi: Identifiable{
    let id = UUID()
    let title: String
    let url: String
    

    var image: Image {
        Image(url)
    }
}

struct PostView_Previews: PreviewProvider {
    static var previews: some View {
        PostView(post: PostUi(title: "post title", url: "photo url"))
    }
}
