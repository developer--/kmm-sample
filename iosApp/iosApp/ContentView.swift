import SwiftUI
import shared





struct ContentView: View {
    
    let sdk = CoreSdk()
    
    @State var postList = [PostUi]()
    @State var isHidden = true
    
	var body: some View {
        List(postList) { post in
            PostView(post: post)
        }
        
        ProgressView().isHidden(isHidden)
        
        Text("Fetch posts").onTapGesture {
            isHidden = false
            let postUseCase = sdk.postUseCase
            postUseCase.execute(){ (posts: [Post]?, _) in
                isHidden = true
                postList.removeAll()
                let mapped: [PostUi] = convertPostToIdentifibleData(posts: posts!)
                mapped.forEach { post in
                    postList.append(post)
                }
            }
        }
	}
}

private func convertPostToIdentifibleData(posts: [Post]) -> [PostUi] {
    return posts.map { post in
        PostUi(title: post.title, url: post.url)
    }
}


struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
        ContentView()
	}
}

extension View {
    @ViewBuilder func isHidden(_ isHidden: Bool) -> some View {
        if isHidden {
            self.hidden()
        } else {
            self
        }
    }
}
